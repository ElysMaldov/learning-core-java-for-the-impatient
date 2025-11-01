package ch10.sec09;

import java.util.Optional;

public class ProcessHandleDemo {
    public static void main(String[] args) {
        ProcessHandle.allProcesses()
            .map(ProcessHandle::info)
            .map(ProcessHandle.Info::command)
            .flatMap(Optional::stream) // Drop all empty Optional
            .filter(s -> s.contains("java"))
            .forEach(System.out::println);
    }
}
