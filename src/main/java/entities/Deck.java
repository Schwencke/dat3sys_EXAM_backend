package entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@NamedQuery(name = "Deck.deleteAllRows", query = "DELETE from Deck")
@Table(name = "deck")
public class Deck implements Serializable {

    @Id
    @Column(name = "deck_id", nullable = false, length = 12)
    private String deck_id;

    @Column(name = "created")
    private Timestamp created;

    @Column(name = "completed")
    private Timestamp completed;

    @Column(name = "finished")
    private boolean finished;

    public Deck() {
    }

    public String getDeck_id() {
        return deck_id;
    }

    public void setDeck_id(String deck_id) {
        this.deck_id = deck_id;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getCompleted() {
        return completed;
    }

    public void setCompleted(Timestamp completed) {
        this.completed = completed;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
