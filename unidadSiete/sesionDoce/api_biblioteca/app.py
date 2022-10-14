from book.resource import books
from lend.resource import lends
from person.resource import persons
from flask import Flask, redirect

app = Flask(__name__)

app.register_blueprint(books)
app.register_blueprint(lends)
app.register_blueprint(persons)

@app.route('/')
def reroute():
    return redirect('/api')

@app.route('/api')
def index():
    return {"msg": "this api works!"}, 200


if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port="5000")