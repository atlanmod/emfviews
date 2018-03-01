EMF Views
=========

[![Build Status](https://travis-ci.org/atlanmod/emfviews.svg?branch=master)](https://travis-ci.org/atlanmod/emfviews)

What is this project about?
---------------------------

Some users only need to see some parts of a model, others have to get the full
model extended with data from another model, and others simply access to a
combination of information coming from different models. Based on the
unquestionable success and usefulness of database views to solve similar
problems in databases, EMF Views brings the same concept to the modeling world.

Screencasts
-----------
These screencasts provide a smattering of the capabilities of this project.
Note that these videos have been recorded with an older version of EMFViews, but
they still show the overall principles and capabilities of the approach.
* [ER 2015 - SQL_EMFViews user perspective](https://youtu.be/TabEjn4Jr4Q)
* [SQL-like DSL to EMF Views internals](http://youtu.be/cds_DU_VJcM)
* [EMF Views](https://www.youtube.com/watch?v=KoCiV8fvNj8)
* [Virtual Views](https://www.youtube.com/watch?v=JRjCqyTM2x8)
* [Demo EMFViews](https://www.youtube.com/watch?v=Lo4kz6Hx3Kg)

What can you find in this repository?
-------------------------------------

These are the core plugins:

* `org.atlanmod.emfviews`: This is the main component of the tool. It includes the
  core logic behind viewpoints and views.
* `org.atlanmod.emfviews.virtuallinks`: An Ecore-based model of links used to
  construct viewpoints and views.
* `org.atlanmod.emfviews.virtuallinks.delegator`: This package delegates the
  creation of virtual links to concrete implementations.
* `org.atlanmod.emfviews.virtuallinksepsilondelegate`: This project generate
  virtual links from the Epsilon Comparison Language (ECL).

We have also defined two DSLs, VPDL and MEL, which have accompanying Eclipse
plugins for edition:

* `org.atlanmod.emfviews.vpdl`: ViewPoint Description Language; useful for
  creating a viewpoint by filtering multiple metamodels, with a syntax inspired
  by the `SELECT` query in SQL.
* `org.atlanmod.emfviews.mel`: Metamodel Extension Language; can extend
  metamodel with new classes, attributes, relations.

The `examples` folder contains ideas of how to use EMF Views and the DSLs:

* `emfviews-tutorial`: Create your first Viewpoint and View.
* `vpdl-tutorial`: Define a viewpoint with VPDL.

Installation
------------
* Import the projects of the "plugins" folder into the workspace
* Run a "Runtime Eclipse" with the workspace to try the plugins. In the
  "examples" folder there are several example projects to test the project

Dependencies
------------
Needed to install the following plugins:
* ATL
* Epsilon
* Xtext

Who is behind this project?
---------------------------
This is an [Atlanmod](http://www.atlanmod.org) project.

The following people have made significant contributions to the project:

* [fmdkdd](https://github.com/fmdkdd "fmdkdd") (primary contact)
* [Hugo Bruneliere](https://github.com/Hugo-Bruneliere "Hugo Bruneliere")
* [Jokin Garcia Perez](https://github.com/jokingarcia "Jokin Garcia Perez")
  (former contributor)
* [Juan David Villa Calle](https://github.com/juandavidvillacalle "Juan David
  Villa Calle") (former contributor)

Copyright information
---------------------

This program and the accompanying materials are made available under the terms
of the Eclipse Public License 2.0 which is available at
https://www.eclipse.org/legal/epl-2.0/

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License, version 3
which is available at https://www.gnu.org/licenses/gpl-3.0.txt
