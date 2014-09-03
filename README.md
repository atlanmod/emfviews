EMF Views
========


What is this project about?
---------------------------

Some users only need to see some parts of a model,  others have to get the full model extended with data from another model, and others simply access to a combination of information coming from different models. Based on the unquestionable success/usefulness of database views to solve similar problems in databases, EMF Views aims to bring the same concept to the modeling world. 

What can you find in this repository?
-------------------------------------

So far, these are the projects:

* fr.inria.atlanmod.emfviews. This project is the main component of the tool. It includes the logic behind viewtypes and views.
* fr.inria.atlanmod.emfviews.ui. This project contributes to the Eclipse UI by defining wizards to ease the creation of viewtypes and views. 
* fr.inria.atlanmod.emfviews.editor. This project contributes to Eclipse UI, by defining an editor to modify viewtypes and views.
* fr.inria.atlanmod.emfviews.vlink-mm. EMF project defining an Ecore model to represent links models.
* fr.inria.atlanmod.emfviews.virtuallinksdelegator. This project delegates the creation of virtual links to concrete implementations
* fr.inria.atlanmod.emfviews.virtuallinksepsilondelegate. This project allows to generate links from the Epsilon Comparison Language (ECL).

Examples:

* myFirstViewTutorial. Create your first Viewtype and View.
* myFirstViewTransformationTutorial. Create your first M2M transformation using a View as input
* enterpriseEAtutorial. Create more complex views in an Enterprise Architecture context.

Who is behind this project?
---------------------------
* [Juan David Villa Calle](https://github.com/juandavidvillacalle "Juan David Villa Calle")
* [Hugo Bruneliere](https://github.com/Hugo-Bruneliere "Jordi Cabot")

Juan David and Hugo work in [Atlanmod](http://www.emn.fr/z-info/atlanmod), a research team of Inria.
