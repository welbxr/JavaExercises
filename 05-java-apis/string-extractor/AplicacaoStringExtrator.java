// www.javatpoint.com/java-string-format -> Explica as formatações e tipos de caracteres que podem ser adicionados ao printf.

void main()
{
    var entry = """
            {"name":"Carlos","age":43}""";

    Map<String, String> dictionary = new HashMap<>();

    entry = entry.replace("{","").replace("}","").replace("\"","");
    var arrayValue = entry.split(",");
    for (var v : arrayValue)
    {
        var valueKey = v.split(":");
        dictionary.put(valueKey[0],valueKey[1]);
    };

    System.out.println(dictionary);
}