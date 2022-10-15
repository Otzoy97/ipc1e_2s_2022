from datetime import datetime
from marshmallow import Schema, fields

class Operacion():
    def __init__(self):
        self.marca_de_tiempo = datetime.now()
    
    def registrar_salida(self, cantidad):
        self.detalle = "Salida"
        self.cantidad = cantidad
        self.salida = True
        self.entrada = False
        return self
    
    def registrar_entrada(self, cantidad):
        self.detalle = "Entrada"
        self.cantidad = cantidad
        self.salida = False
        self.entrada = True
        return self

class OperacionSchema(Schema):
    marca_de_tiempo = fields.DateTime()
    detalle = fields.Str()
    cantidad = fields.Number()
    salida = fields.Boolean()
    entrada = fields.Boolean()