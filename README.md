EMF Views
=========

*Note (November 2017)*: As we are in the process of rewriting most of EMF Views,
some plugins (mainly editors and UI) are outdated and are currently not working
with the new core.

What is this project about?
---------------------------

Some users only need to see some parts of a model, others have to get the full
model extended with data from another model, and others simply access to a
combination of information coming from different models. Based on the
unquestionable success and usefulness of database views to solve similar
problems in databases, EMF Views aims to bring the same concept to the modeling
world.

Screencasts
-----------
These screencasts provide a smattering of the capabilities of this project:
* [ER 2015 - SQL_EMFViews user perspective] (https://youtu.be/TabEjn4Jr4Q)
* [SQL-like DSL to EMF Views internals] (http://youtu.be/cds_DU_VJcM)
* [EMF Views](https://www.youtube.com/watch?v=KoCiV8fvNj8)
* [Virtual Views](https://www.youtube.com/watch?v=JRjCqyTM2x8)
* [Demo EMFViews](https://www.youtube.com/watch?v=Lo4kz6Hx3Kg)

What can you find in this repository?
-------------------------------------

So far, these are the projects:

* fr.inria.atlanmod.emfviews. This is the main component of the tool. It
  includes the core logic behind viewpoints and views.
* ~~fr.inria.atlanmod.emfviews.ui. This project contributes to the Eclipse UI by
  defining wizards to ease the creation of viewpoints and views.~~ (obsolete)
* ~~fr.inria.atlanmod.emfviews.editor. This project contributes to Eclipse UI, by
  defining an editor to modify viewpoints and views.~~ (obsolete)
* fr.inria.atlanmod.emfviews.virtuallinks. EMF project defining an Ecore model
  to represent links models.
* fr.inria.atlanmod.emfviews.virtuallinks.delegator. This package delegates the
  creation of virtual links to concrete implementations.
* fr.inria.atlanmod.emfviews.virtuallinksepsilondelegate. This project allows to
  generate links from the Epsilon Comparison Language (ECL).

The `examples` folder can help give an idea of how to use EMF Views:

* myFirstViewTutorial. Create your first Viewpoint and View.
* myFirstViewTransformationTutorial. Create your first M2M transformation using
  a View as input
* enterpriseEAtutorial. Create more complex views in an Enterprise Architecture
  context.
* 1_EAdata: metamodels and models to be used in the viewpoint and view
* 2_EAview: Example to create views from EA, BPMN, reqif
* EMFViewsSQLTest: Example of view definiton with the DSL

Installation
------------
* Import the projects of the "plugins" folder into the workspace
* Copy the plugins of the "dropins" folder into the "dropins" folder of your
  Eclipse
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
This project is held by [Atlanmod](http://www.emn.fr/z-info/atlanmod), a
research team of Inria, IMT Atlantique, and LS2N.

The following people have made significant contributions to the project:

* [Hugo Bruneliere](https://github.com/Hugo-Bruneliere "Hugo Bruneliere")
* [Jokin Garcia Perez](https://github.com/jokingarcia "Jokin Garcia Perez")
* [Juan David Villa Calle](https://github.com/juandavidvillacalle "Juan David Villa Calle")
* [fmdkdd](https://github.com/fmdkdd "fmdkdd")
