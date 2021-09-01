package module4.programmingwithclass.aggregationandcomposition.t5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/*
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class Choice {
    private TourBase base = new TourBase();
    private List<Tour> selectedTours;

    public Choice() {
        selectedTours = base.getBase();
    }

    private final Comparator<Tour> comparatorDuration = new Comparator<Tour>() {
        @Override
        public int compare(Tour o1, Tour o2) {
            if (o1.getDuration() > o2.getDuration()) {
                return 1;
            } else if (o1.getDuration() < o2.getDuration()) {
                return -1;
            }
            return 0;
        }
    };

    private final Comparator<Tour> comparatorPrice = new Comparator<Tour>() {
        @Override
        public int compare(Tour o1, Tour o2) {
            if (o1.getPrice() > o2.getPrice()) {
                return 1;
            } else if (o1.getPrice() < o2.getPrice()) {
                return -1;
            }
            return 0;
        }
    };

    public List<Tour> getSelectedTours() {
        return selectedTours;
    }

    public void filterTypeTour(TypeTour typeTour) {
        List<Tour> filtered = new ArrayList<>();
        for (Tour t : selectedTours) {
            if (t.getTypeTour() == typeTour) {
                filtered.add(t);
            }
        }
        selectedTours = filtered;
    }

    public void filterTypeFood(TypeFood typeFood) {
        List<Tour> filtered = new ArrayList<>();
        for (Tour t : selectedTours) {
            if (t.getTypeFood() == typeFood) {
                filtered.add(t);
            }
        }
        selectedTours = filtered;
    }

    public void filterDuration(int min, int max) {
        List<Tour> filtered = new ArrayList<>();
        for (Tour t : selectedTours) {
            if (t.getDuration() >= min && t.getDuration() <= max) {
                filtered.add(t);
            }
        }
        selectedTours = filtered;
    }

    public void resetFilters() {
        selectedTours = base.getBase();
    }

    public void sortPrice() {
        selectedTours.sort(comparatorPrice);
    }

    public void sortDuration() {
        selectedTours.sort(comparatorDuration);
    }

    @Override
    public String toString() {
        return "Choice{" +
                "base=" + base +
                ", selectedTours=" + selectedTours +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Choice choice = (Choice) o;
        return Objects.equals(base, choice.base) &&
                Objects.equals(selectedTours, choice.selectedTours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, selectedTours);
    }
}

