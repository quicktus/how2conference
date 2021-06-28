public class Paper_assignment {
    public static void main(String[] args) {

        // ### Replace these values as well as the values in lines 61-66 and it SHOULD work.

        String gitbookUrl = "https://app.gitbook.com/@fau/s/ml4b/reviewers-copies/";
        String formUrl = "https://forms.gle/eUXPR4NEpu35XGZ96";
        String conferenceName = "ML4B Conference 2021";
        String deadline = "10.06.2021";
        String signature = "Max Mustermann und Kilian Wenker";

        String[] people = {"Anton", "Jakob", "Aynes", "Tim", "Emil", "Leon", "Tao", "Christin", "Cody", "Phan",
                "Fabian", "Aaron", "Liam", "Paul", "Kilian", "Max", "Julian", "Samuel", "Khai", "Helena",
                "Felix", "Niklas", "Pia", "Fabio", "Sedat", "Robin", "Tarek", "Bruno", "Dominik",
                "Rayan", "Saburou", "Jonathan", "Pascal", "Alina"};

        String[] titles = {"Clustering Digital Twin Tweets - Anton & Jakob",
                "Clustering of Digital Twin Tweets - Aynes & Tim", "Detecting Trash in the Wild (Emil & Leon)",
                "Generating Grapes for Object Detection -Tao & Christin",
                "Generating Grapes for Object Detection - Cody & Phan",
                "Generating Grapes for Object Detection - Fabian & Aaron", "Generating Tweets - Liam & Paul",
                "Improving NLP text generation using post processing - Kilian & Max",
                "Generating Tweets (Julian & Samuel)", "Generating Tweets (Khai & Helena)",
                "Identify Topics (Felix & Niklas)", "Inpainting Marine Images (Pia & Fabio)",
                "Political Party Classification - Sedat & Robin",
                "Political Party Classification (Tarek & Bruno)", "Political Party Classification - Dominik & Rayan",
                "Political Party Classification - Saburou & Jonathan",
                "Sentiment Analysis of Digital Twin Tweets - Pascal & Alina"};

        String[] types = {"T", "T", "I", "I", "I", "I", "T", "T", "T", "T", "T", "I", "T", "T", "T", "T", "T"};

        String[] slugs = {"rc-01", "rc-02", "rc-03", "rc-04", "rc-05", "rc-06", "rc-07", "rc-08", "rc-09", "rc-10",
                "rc-11", "rc-12", "rc-13", "rc-14", "rc-15", "rc-16", "rc-17"};
        // ###

        int paperCount = titles.length;
        int reviewerCount = paperCount * 2;

        Paper[] papers = new Paper[paperCount];
        Paper[][] personReviews = new Paper[reviewerCount][2];
        int[] personReviewCount = new int[reviewerCount];
        boolean[] personReviewsImage = new boolean[reviewerCount];

        int j = 0;
        for (String i : titles) {
            System.out.println(j + 1);
            papers[j] = new Paper(i, types[j], people[j * 2], people[j * 2 + 1], slugs[j]);

            String[] reviewers = new String[4];

            for (int k = 0; k <= 3; k++) {
                boolean acceptable = false;
                int index = 69;
                while (!acceptable) {
                    index = (int) (Math.random() * reviewerCount);
                    acceptable = ((personReviewCount[index] != 2)
                            && !(types[j].equals("I") && personReviewsImage[index])//paper won't be reviewers second image paper
                            && !(people[index].equals(papers[j].authors[0]))//reviewer is not the 1st author of the paper
                            && !(people[index].equals(papers[j].authors[1]))//reviewer is not the 2nd author of the paper
                            && !(people[index].equals(reviewers[0]))//reviewer does not review this paper yet
                            && !((i.equals("Improving NLP text generation using post processing - Kilian & Max")
                            || i.equals("Political Party Classification - Sedat & Robin"))
                            && (people[index].equals("Kilian")
                            || people[index].equals("Max")
                            || people[index].equals("Sedat")
                            || people[index].equals("Robin")))//chairs don't review each other
                    );

                }
                // System.out.println(people[index]);
                reviewers[k] = people[index];
                personReviews[index][personReviewCount[index]] = papers[j];
                personReviewCount[index]++;
                personReviewsImage[index] = types[j].equals("I");
            }
            j++;
        }

        System.out.println("\nYou can save the bit below as a .csv to save some work\nPeople:");

        for (int i = 0; i < reviewerCount; i++) {
            System.out.println(people[i] + "," + personReviews[i][0].title + "," + personReviews[i][0].slug + ","
                    + personReviews[i][1].title + "," + personReviews[i][1].slug);
        }

        System.out.println("\nMessages:");

        for (int i = 0; i < reviewerCount; i++) {
            System.out.println("\nHallo " + people[i]
                    + ",\ndir wurden im Reviewprozess für die " + conferenceName + " die folgenden zwei Papers zugeteilt:\n\n" +
                    "Titel: " + personReviews[i][0].title + "  " + gitbookUrl + personReviews[i][0].slug + "\nTitel: " +
                    personReviews[i][1].title + "  " + gitbookUrl + personReviews[i][1].slug + ")\n\nReviewformular:  " + formUrl +
                    "\n\nBeide Reviews sind mittels dem oben verlinkten Formular bis einschließlich " + deadline + " abzugeben.\n\nViele Grüße,\n" + signature + "\n");

        }
    }
}

class Paper {
    String title;
    String type;
    String[] authors;
    String slug;
    String[] reviewers;

    public Paper(String title, String type, String authorA, String authorB, String slug) {
        this.title = title;
        this.type = type;
        authors = new String[]{authorA, authorB};
        this.slug = slug;
        reviewers = new String[4];
    }

    public String toString() {
        return (title + "," + type + "," + authors[0] + "," + authors[1] + "," + slug + ","
                + reviewers[0] + "," + reviewers[1] + "," + reviewers[2] + "," + reviewers[3]);
    }
}
