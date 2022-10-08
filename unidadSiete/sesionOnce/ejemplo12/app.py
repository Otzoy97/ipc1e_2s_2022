from flask import Flask
from flask_cors import CORS
from client.routes.client_routes import client
from account.routes.account_routes import account
from transfer.routes.transfer_routes import transfer

app = Flask(__name__)
CORS(app)

@app.route('/')
def index():
    return {"msg" : "This api works!"}

app.register_blueprint(client)
app.register_blueprint(account)
app.register_blueprint(transfer)

if __name__ == '__main__':
    app.run(debug=True)