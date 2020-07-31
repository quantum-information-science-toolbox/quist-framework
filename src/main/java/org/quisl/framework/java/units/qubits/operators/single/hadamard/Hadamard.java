package org.quisl.framework.java.units.qubits.operators.single.hadamard;

import org.quisl.framework.java.units.qubits.Qubit;
import org.quisl.framework.java.units.qubits.math.linear.algebra.hadamard.HadamardMatrix;
import org.quisl.framework.java.units.qubits.math.complex.ComplexNumber;
import org.quisl.framework.java.units.qubits.operators.single.SingleQuantumOperator;

public class Hadamard extends SingleQuantumOperator {

    private ComplexNumber[][] hadamardMatrix;

    public Hadamard(Qubit qubit) throws Exception {

        super(qubit, HadamardMatrix.getHadamardMatrix());

        this.setup();

    }

    @Override
    public String getName() {
        return "Hadamard";
    }

    @Override
    public String getInfo() {
        return "Rotates 90º around the X Axis of the Bloch Sphere;\n" +
               "Acts like a Classical Bit Flip (NOT) ( e.g.: |0⟩ -> |1⟩ or |1⟩ -> |0⟩ );";
    }

    @Override
    public void setup() throws Exception {

        if( ( this.getNumQubits() != this.getQubits().length ) && ( this.getNumQubits() != 1 ) )  {
            throw new Exception();
        }

        this.hadamardMatrix = this.getQuantumOperatorMatrix();

    }

    public ComplexNumber[][] getHadamardMatrix() {

        return this.hadamardMatrix;

    }

}