###
#+--------------------------------------------------------------------+
#| Cakefile
#+--------------------------------------------------------------------+
#| Copyright DarkOverlordOfData (c) 2014-2015
#+--------------------------------------------------------------------+
#|
#+--------------------------------------------------------------------+
#
#
###
fs = require 'fs'

task 'trig', 'generate trig table', (options) ->
  trig = require('./trig.js').init(false);

  _sin = []
  _cos = []

  for s, i in trig.sin_
    _sin.push  "#{s}"
    #break if i > 20

  for c, i in trig.cos_
    _cos.push  "#{c}"
    #break if i > 20

  fs.writeFileSync "src/main/kotlin/math.kt", 
    """
    /**
     * Math polyfills
     */
     object Math {

       /** trig lookup table for cosine */
       fun cos(rad:Double):Double {
        return _cos[(rad * radToIndex).toInt() and SIN_MASK]
       }

       /** trig lookup table for sine */
       fun sin(rad:Double):Double {
        return _sin[(rad * radToIndex).toInt() and SIN_MASK]
       }

       private val radToIndex = #{trig.radToIndex}

       private val SIN_MASK = #{trig.SIN_MASK}

       private val _sin = arrayOf<Double>(#{_sin.join(',')})

       private val _cos = arrayOf<Double>(#{_cos.join(',')})

     }
    """