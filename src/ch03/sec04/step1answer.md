    tzs.removeIf(t -> t.contains("/"));
    Collections.sort(tzs, (first, second) -> first.length() - second.length());
    System.out.println(tzs);
