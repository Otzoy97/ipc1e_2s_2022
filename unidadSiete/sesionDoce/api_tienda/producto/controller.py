from db.db import productos
from producto.model import Producto
from operacion.controller import registrar_entrada, registrar_salida

def agregar(nombre):
    productos.append(Producto(nombre))
    return f"El producto '{nombre}' se agregó"

def listar():
    return productos

def verificar_existencias(nombre, cantidad):
    for producto in productos:
        if producto.nombre == nombre and producto.existencias >= cantidad:
            return True
    return False

def dar_salida(nombre, cantidad):
    for producto in productos:
        if producto.nombre == nombre:
            if producto.existencias >= cantidad:
                producto.existencias = producto.existencias - cantidad
                producto.operaciones.append(registrar_salida(cantidad))
                if producto.existencias < 10:
                    return f"Salió {cantidad} de {nombre}. Hay pocas existencias de '{producto.nombre}'"
                return f"Salió {cantidad} de {nombre}"
            else:
                return f"No hay suficientes existencias de '{nombre}'"
    return f"No se encontró  '{nombre}'"

def dar_entrada(nombre, cantidad):
    for producto in productos:
        if producto.nombre == nombre:
            producto.existencias = producto.existencias + cantidad
            producto.operaciones.append(registrar_entrada(cantidad))
            if producto.existencias < 10:
                return f"Agregado {cantidad} a {nombre}. Hay pocas existencias de '{producto.nombre}'"
            return f"Agregado {cantidad} a {nombre}"
        else:
            return f"No se encontró '{nombre}'"
    return f"No se encontró  '{nombre}'"