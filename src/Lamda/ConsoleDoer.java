package Lamda;
//выбрал нестатический метод, потому что статический
//уже требует реализации в интерфейсе, а само лямбда-выражение
//и так передаётся в качестве аргумента методу.
@FunctionalInterface
public interface ConsoleDoer {
    public String doThing(String arg);
}
