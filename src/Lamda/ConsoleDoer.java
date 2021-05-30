package Lamda;
//решил выбрать статический метод, потому что
//нету смыслa "привязывать" этот метод к какой-то 
//определённой переменной типа ConsoleDoer. Ведь у 
//меня лямбла-выражение передаётся в качестве аргумента метода
@FunctionalInterface
public interface ConsoleDoer {
    public String doThing(String arg);
}
