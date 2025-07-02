# Library-

Strategy Pattern

Interface: SearchStrategy

Concrete: TitleSearch, AuthorSearch, IsbnSearch

Injected into BookService for flexible searching

SOLID Principles

SRP: each class does only one job

OCP: you can add new search strategies without modifying BookService

LSP: any SearchStrategy works seamlessly

ISP: small, focused interfaces without extra methods

DIP: high-level (BookService) depends on abstraction (SearchStrategy), not implementation
