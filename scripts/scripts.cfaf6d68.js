"use strict";angular.module("helloYoApp",["ngAnimate","ngCookies","ngResource","ngRoute","ngSanitize","ngTouch"]).config(["$routeProvider",function(a){a.when("/",{templateUrl:"views/main.html",controller:"MainCtrl"}).when("/about",{templateUrl:"views/about.html",controller:"AboutCtrl"}).otherwise({redirectTo:"/"})}]),angular.module("helloYoApp").controller("MainCtrl",["$scope",function(a){a.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"]}]),angular.module("helloYoApp").controller("AboutCtrl",["$scope",function(a){a.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"]}]);var obj={a:"Var a",b:"Var b",c:"Var c",f1:function(){console.log("This is f1")},d:{f2:function(){this.f1()}},e:{f3:function(){console.log("This is f3")}},f:{f4:function(){obj.f1.call(obj)}},ff:{ff4:function(){obj.f1.apply(obj,[])}},g:{f5:function(){obj.f1()}},h:function(){obj.f1()},i:function(){this.f1()}};