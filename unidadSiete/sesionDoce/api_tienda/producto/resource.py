from flask import Blueprint, request
from .controller import agregar, dar_entrada, dar_salida, listar
from producto.model import ProductoSchema
productos = Blueprint("productos", __name__, url_prefix="/api/producto")

@productos.route("/", methods=["POST"])
def crear():
    body = request.get_json()
    msg_result = agregar(body["nombre"])
    return {"msg": msg_result}, 200

@productos.route("/<nombre>/dar_salida", methods=["PATCH"])
def dar_salida_producto(nombre):
    body = request.get_json()
    msg_result = dar_salida(nombre, int(body["cantidad"]))
    return {"msg": msg_result}, 200

@productos.route("/<nombre>/dar_entrada", methods=["PATCH"])
def dar_entrada_producto(nombre):
    body = request.get_json()
    msg_result = dar_entrada(nombre, int(body["cantidad"]))
    return {"msg": msg_result}, 200

@productos.route("/", methods=["GET"])
def listar_productos():
    return ProductoSchema(many=True).dumps(listar()), 200