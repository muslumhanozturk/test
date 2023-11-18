import os

from flask import Flask, render_template, request, redirect  # etc.
from flask.ext.mongoengine import MongoEngine, MongoEngineSessionInterface
from flask.ext.login import LoginManager
from flask.ext.bcrypt import Bcrypt

# Create and name Flask app
app = Flask("FlaskLoginApp")


app.config['MONGODB_SETTINGS'] = {'HOST':os.environ.get('MONGOLAB_URI'),'DB': 'FlaskLogin'}
app.config['SECRET_KEY'] = os.environ.get('SECRET_KEY')
app.debug = os.environ.get('DEBUG',False)

db = MongoEngine(app) 
app.session_interface = MongoEngineSessionInterface(db) 


flask_bcrypt = Bcrypt(app)


login_manager = LoginManager()
login_manager.init_app(app)
