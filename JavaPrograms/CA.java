public class CA {

    // instance variables
    private final int cNum;   // number of cells
    private int[] rules;      // rules[0] holds the rule for 000
                              // rules[1] holds the rule for 001, etc.
    private int[] cells;      // current state of the automaton
    
    // constructor saves the rules and sets initial state of each cell
    public CA(int N, String bits) {
        // how many rules?  Convert String to int[] for convenience
        int RNUM = bits.length();     
        rules = new int[RNUM];
        for (int i = 0; i < RNUM; i++) {
            rules[i] = Integer.parseInt(bits.substring(i, i+1));
        }
        
        // 2N+1 cells plus dummy cell on each end
        cNum = 2*N + 3;
        // middle cell set to 1, rest are default zero
        cells = new int[cNum];
        cells[cNum/2] = 1;    
    }
    
    // step method advances automaton one step
    public void step() {
        // next set of cells
        int[] next =  new int[cNum];
        
        // figure out the next state based on current cell and its neighbors
        // skip first and last cells which are dummy cells and always zero
        for (int i = 1; i < cNum - 1; i++) {
            // which rule?  based on 4, 2, 1 binary place value
            int ruleIndex = cells[i-1]*4 + cells[i]*2 + cells[i+1];
            next[i] = rules[ruleIndex];
        }
        
        // transfer to current cells
        cells = next;
    }
    
    // current state
    public String toString() {
        String state = "";
        String off = " ";
        String on = "1";
        // ignore first and last cells, they are imaginary
        for (int i = 1; i < cNum - 1; i++) {
            if (cells[i] == 0) state = state + off;
            else               state = state + on;
        }
        
        return state;
    }
    
    public static void main(String[] args) {
        // input N and rules from command line
        int N = Integer.parseInt(args[0]);
        String rules = args[1];
        
        // construct the automaton
        CA cellAuto = new CA(N, rules);
        
        // output initial state
        System.out.println(cellAuto);
        
        // take N steps
        for (int i = 0; i < N; i++) {
            cellAuto.step();
            System.out.println(cellAuto);
        }
    }
}