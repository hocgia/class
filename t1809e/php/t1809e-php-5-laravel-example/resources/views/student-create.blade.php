@extends('layouts.app')

@section('main')
    <div class="container">
        <h3 class="text-center">Create Student</h3>
        <form action="{{url("/student/create")}}" method="post">
            @csrf
            <div class="form-group">
                <label>Name</label>
                <input class="form-control" type="text" name="name" value="{{old("name")}}" placeholder="Name" required>
                @if($errors->has("name"))
                    <p class="error" style="color:red">{{$errors->first("name")}}</p>
                @endif
            </div>
            <div class="form-group">
                <label>Age</label>
                <input class="form-control" type="number" name="age" value="{{old("age")}}" placeholder="Age" required>
                @if($errors->has("age"))
                    <p class="error" style="color:red">{{$errors->first("age")}}</p>
                @endif
            </div>
            <div class="form-group">
                <label>Address</label>
                <input class="form-control" type="text" name="address" value="{{old("address")}}" placeholder="Address" required>
                @if($errors->has("address"))
                    <p class="error" style="color:red">{{$errors->first("address")}}</p>
                @endif
            </div>
            <div class="form-group">
                <label>Telephone</label>
                <input class="form-control" type="string" name="telephone" value="{{old("telephone")}}" placeholder="Telephone" required>
                @if($errors->has("telephone"))
                    <p class="error" style="color:red">{{$errors->first("telephone")}}</p>
                @endif
            </div>
            <div class="form-group text-right">
                <button type="submit" class="btn btn-success">Save</button>
            </div>
        </form>
    </div>
@endsection
