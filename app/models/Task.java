package models;

import play.db.ebean.Model;

import javax.persistence.Id;
import javax.persistence.Entity;

/**
 * Created by daviesc8 on 17/09/15.
 */
public class Task extends Model{

    @Id
    public String id;

    public String contents;
}

