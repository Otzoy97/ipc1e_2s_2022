from flask import Blueprint, jsonify, request
from db.database import bankDatabase
from client.models.client_model import Client

client = Blueprint('client', __name__, url_prefix='/api/client')

@client.route('/create', methods=['POST'])
def create():
    '''Servicio para crear un cliente'''
    body = request.get_json()
    try:
        if ("cui" in body and "name" in body and "lastname" in body):
            ## la petición está bien escrita
            client = Client(body["cui"], body["name"], body["lastname"])
            if (bankDatabase.addClient(client)):
                return {'msg': 'cliente creado exitosamente'}, 201
            return {'msg': 'cliente duplicado'}, 400
        else:
            return {'msg': 'faltan campos en el cuerpo de la petición'}, 400
    except:
        return {'msg': 'ocurrió un error en el servidor'}, 500

@client.route('/view/<cui>', methods=['GET'])
def view(cui):
    '''Servicio para recuperar los datos de un cliente'''
    try:
        client = bankDatabase.getClient(cui)
        if (client != None):
            return jsonify(client.getData()), 200
        else:
            return {'msg': 'No se encontró el cliente'}, 404
    except:
        return {'msg': 'ocurrió un error en el servidor'}, 500