from db.db import operaciones
from operacion.model import Operacion

def registrar_salida(cantidad):
    operacion = Operacion().registrar_salida(cantidad)
    operaciones.append(operacion)
    return operacion

def registrar_entrada(cantidad):
    operacion = Operacion().registrar_entrada(cantidad)
    operaciones.append(operacion)
    return operacion