angular.module('emfViewsApp').config(['$routeProvider','$httpProvider', 
	function($routeProvider, $httpProvider){
		$routeProvider.when('/',
		{
			templateUrl : 'app/partials/main.html',
			controller : "mainCtrl"
		}).when('/documentation',
		{
			templateUrl : 'app/partials/documentation.html',
			controller : "mainCtrl"
		}).when('/examples',
		{
			templateUrl : 'app/partials/examples.html',
			controller: "mainCtrl"
		}).when('/contacts',
		{
			templateUrl : 'app/partials/contacts.html',
			controller: 'mainCtrl'
		}).
		when('/about',
		{
			templateUrl : 'app/partials/about_us.html',
			controller: 'mainCtrl'
		}).
		when('/install',
		{
			templateUrl : 'app/partials/install.html',
			controller : 'mainCtrl'
		})
		.otherwise(
        {
          redirectTo : "/"
        }
      );
	}]);