import {createBrowserRouter} from "react-router-dom";

import {PokeBox} from "./Pages/PokeBox.tsx";



export const router = createBrowserRouter([
    {
        path: "/",
        children: [
            {path: "/pokebox", element: <PokeBox />},
        ]
    }



])