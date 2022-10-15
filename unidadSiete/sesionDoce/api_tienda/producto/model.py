from marshmallow import Schema, fields
from operacion.model import OperacionSchema

class Producto():
    def __init__(self, nombre):
        self.nombre = nombre
        self.existencias = 0
        self.operaciones = []

class ProductoSchema(Schema):
    nombre = fields.Str()
    existencias = fields.Int()
    operaciones = fields.Nested(OperacionSchema,many=True)
    
'''
public class Product {
    public String name;
    public Product(name) {
        this.name = name;
    }
}
'''