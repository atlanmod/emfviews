EMF Views
=========

[![Build Status](https://travis-ci.org/atlanmod/emfviews.svg?branch=master)](https://travis-ci.org/atlanmod/emfviews)
![License](https://img.shields.io/badge/license-EPL%202.0%20%2F%20GPL%203.0-blue.svg)

EMF Views is an Eclipse plugin that brings the concept of database views to the
modeling world.  You can create views that focus on only part of a model, or
views that combine several models from different metamodels.  Views can be
navigated and queried as regular models are, and they can used as inputs to
model transformations.

Installation
------------

The simplest option is to add our [update site][] to Eclipse, and to install the
EMF Views feature from there.  To get started, see our [user manual][] for
tutorials.

Alternatively, you can clone this repository and build the update site locally
with [Maven](https://maven.apache.org/):

```
$ git clone https://github.com/atlanmod/emfviews.git
$ cd emfviews
$ mvn install
```

You can then install the plugins by pointing to the generated update site in
your local m2 repository.

Development setup
-----------------

If you want to contribute to EMF Views, you can either use the Maven setup as
above, or you can import the projects in Eclipse.

With the Maven setup, you should be able to build and run the tests locally.
This is the same setup that is used by our Travis integration.

For playing with the plugins inside an actual Eclipse, you should first import
the projects of this repository inside Eclipse.  You'll need the following
dependencies installed for all the plugins to build:

* [ATL](https://www.eclipse.org/atl/)
* [Epsilon](https://www.eclipse.org/epsilon/)
* [Xtext](http://www.eclipse.org/Xtext/)

Then you can test them by launching a guest Eclipse with all the plugins from
the workspace (right-click on the EMF Views plugin in the package explorer ▶ Run
As ▶ Eclipse Application).

What can you find in this repository?
-------------------------------------

In the `plugins` folder:

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

Who is behind this project?
---------------------------

This is an [Atlanmod](http://www.atlanmod.org) project, the tool platform of the
[NaoMod](https://naomod.github.io/) research group.

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

[update site]: http://atlanmodexp.info.emn.fr:8800/updatesite/snapshot/
[user manual]: https://www.atlanmod.org/emfviews/manual/user.html
