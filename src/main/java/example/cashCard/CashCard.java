package example.cashCard;

import org.springframework.data.annotation.Id;

record CashCard(@Id Long id, Double amount) {
}
