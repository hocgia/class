@extends('layouts.app')

@section('main')
    <div class="container">
        <h3 class="text-center">List Student</h3>
        <table class="table">
            <thead>
            <th>Id</th>
            <th>Name</th>
            <th>Age</th>
            <th>Address</th>
            <th>Telephone</th>
            </thead>
            <tbody>
            @foreach ($students as $student)
                <tr>
                    <td>{{$student->id}}</td>
                    <td>{{$student->name}}</td>
                    <td>{{$student->age}}</td>
                    <td>{{$student->address}}</td>
                    <td>{{$student->telephone}}</td>
                </tr>
            @endforeach
            </tbody>
        </table>
    </div>
    <div>
        {!! $students->links() !!}
    </div>
@endsection
