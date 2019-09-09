<!DOCTYPE html>
<html lang="{{ str_replace('_', '-', app()->getLocale()) }}">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- CSRF Token -->
        <meta name="csrf-token" content="{{ csrf_token() }}">

        <title>Laravel</title>
        <!-- Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,600" rel="stylesheet">

        <link rel="stylesheet" href="{{asset("vendor/bootstrap-4.3.1-dist/css/bootstrap.css")}}">

    </head>
    <body>
        <div>
            <nav class="navbar navbar-expand-sm bg-light">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="/home">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/student/create">Create Student</a>
                    </li>
                </ul>
            </nav>
        </div>
        <div>
            <div>
                @yield('main')
            </div>
        </div>
        <div class="bg-info p-3">
            <h2 class="text-center" style="color: #fff">footer</h2>
        </div>
    </body>
</html>
