<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

use App\Student;
use App\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

Route::get('/', 'StudentController@show');

Route::get('/home', 'StudentController@show');

Route::get('/student/create', 'StudentController@create');

Route::post('/student/create', 'StudentController@store');
