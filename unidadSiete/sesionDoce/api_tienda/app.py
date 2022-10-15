from flask import Flask
from producto.resource import productos

app = Flask(__name__)

app.register_blueprint(productos)

@app.route('/')
def index():
    return {"msg": "this api works!"}, 200

if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port=5000)