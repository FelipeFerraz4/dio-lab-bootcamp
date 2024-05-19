package com.bluefox.view;

import java.time.LocalDate;

import com.bluefox.model.Bootcamp;
import com.bluefox.model.Course;
import com.bluefox.model.Dev;
import com.bluefox.model.Mentoring;

public class App {
    public static void main(String[] args) throws Exception {
        Bootcamp bootcamp = new Bootcamp("Santander 2024 - Backend com Java", "Boas-vindas à trilha de Back-end Java do Santander Bootcamp 2024! Aprenda desde os primeiros passos com Java partindo da sintaxe básica até a implementação de uma API utilizando Spring para se tornar um profissional atrativo no mercado.");

        Course course1 = new Course("Versionamento de Código com Git e GitHub", "O curso de Git e Github tem como objetivo ensinar a trabalhar em equipe usando as ferramentas git e github.", 2);
        bootcamp.getContentRegisted().add(course1);

        Course course2 = new Course("Conhecendo Collections Java","Conhecendo Collections Java é uma introdução às estruturas de dados oferecidas pela biblioteca de Collections da linguagem Java. O guia abrange interfaces e classes como List, Set, Map, explicando suas aplicações e diferenças. É essencial para desenvolver aplicações eficientes e bem-estruturadas.",4);
        bootcamp.getContentRegisted().add(course2);

        Course course3 = new Course("Ganhando Produtividade com Stream API", "Ganhando Produtividade com Stream API ensina a utilizar a Stream API do Java para processar coleções de dados de forma mais eficiente e concisa. Este recurso destaca como a API simplifica operações como filtragem, mapeamento e redução.", 2);
        bootcamp.getContentRegisted().add(course3);

        Mentoring mentoring1 = new Mentoring("Como destacar o seu portfólio de projetos na prática.", "Como destacar o seu portfólio de projetos na prática oferece estratégias eficazes para apresentar seus projetos de forma atraente e profissional.", LocalDate.of(2024, 6, 4));
        bootcamp.getContentRegisted().add(mentoring1);

        Dev dev1 = new Dev("Lucas");
        dev1.registerBoocamp(bootcamp);

        Dev dev2 = new Dev("Samanta");
        dev2.registerBoocamp(bootcamp);

        System.out.println(dev1.getSubscribedContent());

        System.out.println();
        dev2.progress();
        dev2.progress();
        System.out.println(dev1.getCompletedContent());
        System.out.println(dev2.getCompletedContent());

        System.out.println();
        dev2.progress();
        dev1.progress();
        System.out.println(dev1.getCompletedContent());
        System.out.println(dev2.getCompletedContent());

        System.out.println();

        System.out.println(dev1.calculeteXPTotal());
        System.out.println(dev2.calculeteXPTotal());
    }
}
