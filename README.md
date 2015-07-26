EMF Views
========


What is this project about?
---------------------------

Some users only need to see some parts of a model,  others have to get the full model extended with data from another model, and others simply access to a combination of information coming from different models. Based on the unquestionable success/usefulness of database views to solve similar problems in databases, EMF Views aims to bring the same concept to the modeling world. 

Screencasts
-----------
These screencasts provide a smattering of the capabilities of this project:
* [EMF Views](https://www.youtube.com/watch?v=KoCiV8fvNj8)
* [Virtual Views](https://www.youtube.com/watch?v=JRjCqyTM2x8)
* [Demo EMFViews](https://www.youtube.com/watch?v=Lo4kz6Hx3Kg)

What can you find in this repository?
-------------------------------------

So far, these are the projects:

* fr.inria.atlanmod.emfviews. This project is the main component of the tool. It includes the logic behind viewtypes and views.
* fr.inria.atlanmod.emfviews.ui. This project contributes to the Eclipse UI by defining wizards to ease the creation of viewtypes and views. 
* fr.inria.atlanmod.emfviews.editor. This project contributes to Eclipse UI, by defining an editor to modify viewtypes and views.
* fr.inria.atlanmod.emfviews.vlink-mm. EMF project defining an Ecore model to represent links models.
* fr.inria.atlanmod.emfviews.virtuallinksdelegator. This project delegates the creation of virtual links to concrete implementations
* fr.inria.atlanmod.emfviews.virtuallinksepsilondelegate. This project allows to generate links from the Epsilon Comparison Language (ECL).

Plugins concerning the DSL to define viewpoints:
* emfviews.dsl
* emfviews.dsl.sdk
* emfviews.dsl.tests
* emfviews.dsl.ui

ATL project:
* SQL2VirtualLinks: transformation to generate virtual links model from DSL model

Examples:

* myFirstViewTutorial. Create your first Viewtype and View.
* myFirstViewTransformationTutorial. Create your first M2M transformation using a View as input
* enterpriseEAtutorial. Create more complex views in an Enterprise Architecture context.
* 1_EAdata: metamodels and models to be used in the viewpoint and view
* 2_EAview: Example to create views from EA, BPMN, reqif
* EMFViewsSQLTest: Example of view definiton with the DSL

Who is behind this project?
---------------------------
* [Hugo Bruneliere](https://github.com/Hugo-Bruneliere "Hugo Bruneliere")
* [Jokin Garcia Perez](https://github.com/jokingarcia "Jokin Garcia Perez")
* [Juan David Villa Calle](https://github.com/juandavidvillacalle "Juan David Villa Calle")

Jokin and Hugo work in [Atlanmod](http://www.emn.fr/z-info/atlanmod), a research team of Inria.
