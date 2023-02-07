package ru.job4j.hmap;

import java.util.*;
import java.util.Collections;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int totalScore = 0;
        int totalSub = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
                totalSub++;
            }
        }
        return (double) totalScore / totalSub;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int totalScore = 0;
            int totalSub = 0;
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
                totalSub++;
            }
            result.add(new Label(pupil.name(), (double) totalScore / totalSub));
        }
        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> subjectsScore = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                Integer score = subjectsScore.get(subject.name());
                if (score == null) {
                    subjectsScore.put(subject.name(), subject.score());
                } else {
                    subjectsScore.put(subject.name(), score + subject.score());
                }
            }
        }
        List<Label> result = new ArrayList<>();
        for (String key : subjectsScore.keySet()) {
            result.add(new Label(key, (double) subjectsScore.get(key) / pupils.size()));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int totalScore = 0;
             for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
            }
            labels.add(new Label(pupil.name(), totalScore));
        }
        Collections.sort(labels);
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> subjectsScore = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                Integer score = subjectsScore.get(subject.name());
                if (score == null) {
                    subjectsScore.put(subject.name(), subject.score());
                } else {
                    subjectsScore.put(subject.name(), score + subject.score());
                }
            }
        }
        List<Label> subjectsLabel = new ArrayList<>();
        for (Map.Entry<String, Integer> subjectScore : subjectsScore.entrySet()) {
            subjectsLabel.add(new Label(subjectScore.getKey(), subjectScore.getValue()));
        }
        Collections.sort(subjectsLabel);
        return subjectsLabel.get(subjectsLabel.size() - 1);
    }
}
