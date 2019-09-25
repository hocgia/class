<?php

namespace App\Http\Controllers;

use App\Servey;
use Illuminate\Http\Request;

class Survey extends Controller
{
    public function index() {
        return view('survey');
    }

    public function store(Request $request) {
        $survey = new Servey();
        $survey->name = $request->get('name');
        $survey->email = $request->get('email');
        $survey->telephone = $request->get('telephone');
        $survey->feedback = $request->get('feedback');
        $survey->save();
        return response()->json('ok', 200);
    }
}
