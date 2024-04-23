<!DOCTYPE html>
<html>
<head>
    <title>Seleccionar Tratamiento</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }

        form {
            max-width: 400px;
            margin: 20px auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }

        h2 {
            margin-top: 0;
        }

        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input[type="number"],
        select {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            width: 100%;
            background-color: #4CAF50;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <h2>Seleccione un tratamiento:</h2>
    <form action="SeleccionTratamientoServlets" method="post">
        <label>Costo Base:</label>
        <input type="number" name="costoBase">
        
        <label>Descuento (%):</label>
        <input type="number" name="descuento">
        
        <label>Costo Extra:</label>
        <input type="number" name="costoExtra">
        
        <label>Tratamiento:</label>
        <select name="tratamiento">
            <option value="limpieza">Limpieza</option>
            <!-- Agrega más opciones de tratamientos aquí -->
        </select>
        
        <input type="submit" value="Calcular Costo">
    </form>
</body>
</html>
