from flask import Flask, request
from marshmallow import Schema, fields
from codigo import descuentos
from productos import menus

app = Flask(__name__)

ordenes = []


class Orden:
    def __init__(self, combo, descuento):
        self.completada = False
        self.combo = combo
        self.descuento = descuento

class OrdenSchema(Schema):
    completada = fields.Str()
    combo = fields.Raw()
    descuento = fields.Number()


@app.route('/orden', methods=["POST"])
def crear_orden():
    body = request.get_json()
    if not(elemento_existe(menus, body["combo"])):
        return {"msg": "El menú no existe"}, 404
    if body["descuento"]:
        if not(elemento_existe(descuentos, body["descuento"])):
            return {"msg": "El código de descuento no existe"}, 404
    descuento = get_elemento(descuentos, body["descuento"])
    menu = get_elemento(menus, body["combo"])
    ordenes.append(Orden(menu, descuento["descuento"]))
    return {"msg": "Orden agregada existosamente"}, 200

@app.route('/orden', methods=["GET"])
def listar_ordenes():
    return OrdenSchema(many=True).dumps(ordenes), 200


def elemento_existe(lista, codigo):
    for m in lista:
        if m["codigo"] == codigo:
            return True
    return False

def get_elemento(lista, codigo):
    for d in lista:
        if d["codigo"] == codigo:
            return d
        


if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port=5000)

