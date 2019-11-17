package com.titanum.neural;

import com.titanum.neural.math.IActivationFunction;
import com.titanum.neural.math.Linear;
import com.titanum.neural.math.RandomNumberGenerator;
import com.titanum.neural.math.Sigmoid;

/**
 *
 * NeuralNetConsoleTest
 * This class is solely used for creating and testing your very first Neural 
 * Network in Java 
 *
 * @author Alan de Souza, Fábio Soares
 */
public class NeuralNetConsoleTest {
    public static void main(String[] args){
        
        RandomNumberGenerator.seed=0;
        
        int numberOfInputs=2;
        int numberOfOutputs=1;
        int[] numberOfHiddenNeurons= { 3 };
        IActivationFunction[] hiddenAcFnc = { new Sigmoid(1.0) } ;
        Linear outputAcFnc = new Linear(1.0);
        NeuralNet nn = new NeuralNet(numberOfInputs,numberOfOutputs,
                numberOfHiddenNeurons,hiddenAcFnc,outputAcFnc);
        System.out.println("Neural Network created!");

        
        double [] neuralInput = { 1.5 , 0.5 };
        
        double [] neuralOutput;
        
        
        nn.setInputs(neuralInput);
        nn.calc();
        nn.print();
        System.out.println("Feeding the values ["+String.valueOf(neuralInput[0])+" ; "+ String.valueOf(neuralInput[1])+"] to the neural network"); 

        neuralOutput=nn.getOutputs();
        for (int i = 0; i < neuralOutput.length; i++) {
        	System.out.println("Output generated "+neuralOutput[i]);
		}
        /*
        
        neuralInput[0] = 1.0;
        neuralInput[1] = 2.1;
        
        System.out.println("Feeding the values ["+String.valueOf(neuralInput[0])+" ; "+ String.valueOf(neuralInput[1])+"] to the neural network"); 
        
        
        nn.setInputs(neuralInput);
        nn.calc();
        neuralOutput=nn.getOutputs();
        for (int i = 0; i < neuralOutput.length; i++) {
        	System.out.println("Output generated "+neuralOutput[i]);
		}
		
		*/
        
    }
}
