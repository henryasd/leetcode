import java.util.*;

/**
 * Created by Henry on 2017/7/31.
 */
public class SCAW_30 {
    public static void main(String[] args){
        new SCAW_30().begin();
    }

    private void begin() {
        String s = "ttqupktjvqeeylzkyirjnnjuhyrmrhwkaoepyzavshbquaasltdyimtpmmddtzotnsknsnkkumcooeizxmyfyrwlfbqyaetpzdetsodmahcpllqizopzhnmmodkqhdfijjbbxgqansryfhiewzgfmsscvcsfizntkpukvkkjfbjmkutitzoirgmpkfuughnrykbuwnfbqqqckjlgizqbhcqtjkosudlunookbvntodvymggwhyaodqkodygzbrtpfkbifodtszughcdpdffgvpwapdzrwtiefjomxsirrcyygdpjixrfmogctfvpafvfqksncchtgftmklysipxudfyynvoncjvsvpixrpsxumlexjyfbxbgdcfqzvfcgcuctczmtsjngxtdgtkjrnqwrxorsvvyaratwcgpurfaoyfxurgneylyvzrpwmowdqqzsyropwqewvbqojfvkqtfrkxowlmbdcdycumssdwoazhpkmkufdcwpzmnmzopdtngpcyhfwyfxhuhvecajexyfjlrkcioxywnauwfsumpbhwxnazzgwzlincurnioleblaysssejwngvdgucntdadqdxhqgwdmxonxghsmrqazldhfhuakvdbabksjgvvglkdtuxhlnhkymtgtogglmhnnrhwaetgrelkyjrlwbxxnqfjgnptzygmrpkrtezkklwiwqvursrgkyrrmgklgtaykmpgqpsacpkyhfsazmgkkadygnmnioltaczrtrtvigvpnqrncazoacpirbvapivpnwigpeeykzpxphmtjlkjnzrhaphrxeimartpxxphyheoqtjzetiuszbuokloowaqnvhkuzttgzjwssxxmftggubxeoluknkzjtldsgyygjwyctxqaqwhmzeqqrmcewepsrvkyvjgfhehbezbwxkjxqbphoromxfepappwavdhzkkflociynhpowycqmrnsveumtsmovwqhgxsuzdvmkkdjihzxyoruvlioevfbtvjzsdwugritblcltdkrtbnonydtvkwofhnzljvtceodrqrktbendtdstinosjczrsbedwzgcolugcgagmpliudbdqqvbuxumyyquawxqhtwmzwsondwiizlapibmfyyfyoaymzouulivjajzfhhnhunyeqkmojrnztnmuciopqkyqtxxbgkkczihrttiemxdgkpaoxpdnzefudcxkohmpsvjlqrpdoujykjpjaszbygycjvozfarxyakorbrhvchhowtorsqpyotjlhlskcricbwveqecsllgiexbwpsxfmgqttldvcnzgmwkcaowmafwecxdrpcwdkoxezczeqbkexwiyleknlgtnfwgwaealtzpuboytrkxphfnumxhxfanmztizykktjbpnsqgjagyhnldzkkzpnmdohmpfwcaidqvvidhilfszrvadibvxnynvkccjgftmxqhftqnhwfgpdislmnkzmxwybbjigcudsdkouxvqfdhinzvzphbdezdfanpirjnmnxcjxxbccimpjjraqsdwrhbuwtencsbrrdaocdqenewxnpzfhdbamfwkybxatbumewbjatnnylmlamrjrumfzkpxloagputwqufsnuiliwzkkswbmiimszlgolmfhhdabisrfcenzfzjxvnmfxayxlgnzssgayidibwnfbceicqizfufcwfzjlmidhrffzlpchdikhotlgbllxsotxncicnnletsdehinmsyugthnuuyrmomjeoridfthannguvvhntdvomkkhjbtzpfdgyljfgrftgnqbjzqecltqwdxhhtgwymcyzoegfjblxrogqekurflpjkwqdfodttcuhgamrezqxpyovlkoqvezgcrljgpcztxizzwsfvjdmhthsdvlbbmjeeunmjsnervdsryyohbaqwjlzgwaiijmogbcrtpwmmbffzdtggvzcgkbngexqplfvmhpizlulmztmeoukmtmsdohlugclrjhgsyorjkfvmajqogbazntfdcsxjwlcfuiasytbjayvaklpqmprckwfppfynqctklvcjofupfpppbgfpwzrivzxmexawavglqkwgprxwgnmjttbrssaqrxexvetvbbitleacvxzcmnnigozbjzrazvauctrdxzzkdbnzyodndqvjhwmqydsxbstdokilljvqkkrjauydntpwpbmnhemixfnnrxyehtvrgmcgjamyvbulegalkpvjwiwqiwupsrgyglgplsphtjuarwldnhnkrlcziwqcqzawkinvbcewnawezkhmtwwkkamuxcwpbylngylhcpgpsevrocfhbeuleghbkdsobdbjdmrhezwydtrswwbzavkfdriqwbezehikwbrcaqagjrahnbgozsvelduheaglipveqogteizobzxoceebwbgifcrjdyunprrhgzamjzckaaadehgciomnrgzwevjvnccvbdhkekufkwkqdqumhhzynawtwfojhsgkxnucxqjhotzsluesdfsqgolcvbncttmriivgagppbphmjnhmsbeyqrclsrqnkcgvnbbnhqeihlxsygethktxbwlvnbjafpvstyicqmnyykqyqxrxhlxljigylpaqhxlavtemfrkfbcgtzzthmqsvaywlqwdxuozpjddrvpwysesrelasduqdvmqlivkemjwvozmjrlijrcavpdquxgxsspdckphyyfungiyxvignkjkboavlgugalldybmwzrsozbnxyvfniqyleahsjdyjpjmnkyjmrcarfpqfnxtvotgutpmetmoiwcxidgwwkxnpofvbdqwtjfnewcjpozzmbwxgftdpsshhaciduhwdmljinuaetbqxanffjiubddidfrgbyeemrqwfkyjeabdcrihatdbwhmzodhqdnwpemljzmudmyiqpqxpjcsflegajnsmaqdhfrsednjrlrhchgttinaushwdwqszgvgnmyrrnaiyrrcbxvwgjwcdfagcqybywjmkhfcvgkvzcacbvyjgxljcnsefqheoqszaxbvfnshrsjtqkcwhqgjdaqjsxphojgoihlowfxoyihqslmbbunhudqnahuqqcgylrohxlxxweposbstyfasishkbdbrfhsqbiaauxzqeogwrarpfuipmpaovdhambtnkvpguoyyeewwhqlmkvcyneoihyivzdjjyarvppttwsrdidpuytslzhtiheegjpskpjfgzacxstacwrwxnrkmagvhkzpvohffrkmslopfhpigigfvzpibvdiheadshixavlsgzhljyvrhewcflmhhprotrtnzcnbxyufadsjcqalwynbjaksrcjnvccwgrydssksvddztfkrdasocdhthqiculzbezgwrroowtoraaifaaucfdymvirpvsqarzwiqnymiodjpnorniwvnuhieayasqajpythnstwgyfxnvpdglythhclicnaspmkofrbxnxgnefbaueghcbqldetfrwahikxnbanqyveeafgxloepqxatbwbssbbcnapobehzzlfcsmzdadsqaumdqnykozmbaerbiackljmfvnkyseotzcyrpwcfyoiyscbdcfpqodxmqikioadndchsyjawziwsmzxpemhvrehhmrpdrtsuxzpxiruizscmubdapkvgoendvegpzylwacuitqstkwhexmfmwcumhjpeoxtnyfmyjgidwdygzfnzrunpwibfrtkhsfvqkjowpzzncxvbeiaxcombypgriszdywtkfkgujfjnceqgnrfrhruhjbyttxwrtqcaciunqdaskqbxjgqsalzjoyehxbbttftvpqifviafadeklxclicwwcbfbeiuxpquficmdmolmtryfobswfrujsckykhvaxphftvkfkvtdnskbvdaauujowvmjcjlzasgtnrazmvfbnrfkufkqbvgarsjtduvdobyduyfhumkjdpuawgqycxavrjqxflavpzyjzdsvpffvubvrhlrjkrgecxbjkdebcenekfzbmgwhhrapdtanmhrqguzqyfuclhgvoixbotkylmpqfrftyzjgtkzrrtwcacaqmxrdsbbfnsxujdnkeyqziptzkpemtedgdulxyofngciphxznwqnghiisxoessjaxelwczdrfgzvpzufxmsdwclozzurtesskdrofufkchhuiezfqtimvwcuxzntfhlrnefszmebvmvdsuiiprxkpbemcufhbtaozfiyuncpbxttubdjuawlecygwfqaaqqayzasmchpcciygljcofosioagvqgyjxyhwabkdkzhnjfvuqxiwlcgzdmvvvtgutpstqcybdfqomliditbuvhvavqyslemeueamiapngfbuskzbfaxcjudhldzyjmfdqfsbfhonpqihchkhkjjteoarrapbouggbahhiwuzoegsotzycktizwzswrvmlesneawoysnozwgnpfntrgescdnawimiohxvhtlhnzvmxdzokohbxnubrhcnrqxizwdiropfpmrmptazhkdexxiqgkgzcfjccmmtdcysqshgljhutkbtjjjrvrtzxcdbpquuuvmknvsafawymztykfphwihvnmwectywomjdibfnddnsfhqpohxkseifqgjvzhtpvcudgbslhgdmptbdbyptezaxgjshsnxnqtryvjjcrnoiirnlqdewcgvkppshdpvvkotfzcjrrzbarpljushwydjosbxvsuqcijkiovbfvcfottznlgmljvbcwzxqvouezeopcpvxtcnnvmaisoucjvehwdxstsyvymkadfzwiolfaoovcixofdvcivwcpuxpghqjprhzgteihsdlcczifvmosisjerymaqvpieoqxtygncsqeramomcgwupanqmngjfontgnoftejlunfuzvidceztgmlucsfhiscphrwbvforsvnurvzvzzohlabnugucaztiqpjnuzgpvtlmokhpjxwvzxkvfhyfgrnyjyndatsvodjcqstzrpwtohotqmaygqwpoluqgnluswyiqtkiigbwpprhetfmjddaqxqwmeshasrrlbbvietzvkhbeonpsqpioghckzjmubfhcgdmmwoijxjplxedpuofavimwtasugazodnbbblkyuzktepjafqccyqbsqtoyvnnadqcebmfvorruiawoqyqrotlgnbfirujuknynbfkrwblhdhvuhnnxhaewbjgsdrmpencismzrqlytuvnekcbtcfreqywtrjiwymeqbfjrqhknearpcukfaclsahmrswpqlvjmbsdtcnigpzxsukzwmkootchmbxeounavgfrkuzqkbqexadvmnlciojurgbfdohaworgirzsupwrrbmfqxhznqvgzwncnucjiuqtnpnhgmyxnmcejjdzbafaxtckpftazltocgvisvhihjmsurrwrxwqqzahgwhhjcvmlswdnelwnzokqggkdeavfdelbmsmopabhxfwbssquhcmpkwupzpuetihhctysuzzrgwubqmvxpjoziiohxlntvucxpcpjcrckpynflifautbccqjbdywasbxhdpthixuxwhehqljkfkojcxmhvlhpmhwryrzgptflajusvfecpsnurbdomldaucsstrykmdvmorhlwnpogcizelosyrtuvlmrembqrxeiqntnbjbjnlitywmxqhrlugeyugqmfwuvkpinylwowghvdvuveniyvnyqtocylytxnekopicoolltjfonuzmqmkghbkhoialvgxlyhpmvdxpmefzyenosawzbggrojcmrbzpipddscueicfhivxbvwcyclprutfnuedevijnngtvibeqwcttyytcjivfdaszhxdcimqvsjqakvtizobxmubxexchxvgeulhcyzxqkotxjofkejjrfkokhttfoclknunntkggazdlpkvttemzpdlwwgdmirwyljlhwrpwssihcddykrzzukxssdgbwdbjomqmghjyztiewnciedhbphvhmckihlrxykkgrvetooxmbbvieejtleaxinhryzpylzecwlvkzuwdvrlbwuwjaxjlmqckrrjcspfoacaaxxduqqwmksymrhxdzcortztooaepffrccwwsmuhynfkgokknmaghbcvpcagjfzljvkdjgkhvrucfgovsqbbrdxii"
                ;
        String [] words = {"wxnazzgwzlincurnioleblays","txwrtqcaciunqdaskqbxjgqsa","vdhzkkflociynhpowycqmrnsv","sondwiizlapibmfyyfyoaymzo","advmnlciojurgbfdohaworgir","gbwpprhetfmjddaqxqwmeshas","vmjcjlzasgtnrazmvfbnrfkuf","zjxvnmfxayxlgnzssgayidibw","xmsdwclozzurtesskdrofufkc","gglmhnnrhwaetgrelkyjrlwbx","galldybmwzrsozbnxyvfniqyl","ofrbxnxgnefbaueghcbqldetf","ltaczrtrtvigvpnqrncazoacp","psacpkyhfsazmgkkadygnmnio","mztmeoukmtmsdohlugclrjhgs","gjdaqjsxphojgoihlowfxoyih","gpcztxizzwsfvjdmhthsdvlbb","bksjgvvglkdtuxhlnhkymtgto","mewbjatnnylmlamrjrumfzkpx","orsqpyotjlhlskcricbwveqec","wsrdidpuytslzhtiheegjpskp","zehikwbrcaqagjrahnbgozsve","lzjoyehxbbttftvpqifviafad","phyyfungiyxvignkjkboavlgu","zdadsqaumdqnykozmbaerbiac","zxyoruvlioevfbtvjzsdwugri","xtvotgutpmetmoiwcxidgwwkx","cpvxtcnnvmaisoucjvehwdxst","jfgzacxstacwrwxnrkmagvhkz","nubrhcnrqxizwdiropfpmrmpt","rwahikxnbanqyveeafgxloepq","zncxvbeiaxcombypgriszdywt","ottznlgmljvbcwzxqvouezeop","rqguzqyfuclhgvoixbotkylmp","zdsvpffvubvrhlrjkrgecxbjk","kqbvgarsjtduvdobyduyfhumk","azhkdexxiqgkgzcfjccmmtdcy","igcudsdkouxvqfdhinzvzphbd","igylpaqhxlavtemfrkfbcgtzz","ezdfanpirjnmnxcjxxbccimpj","hwydjosbxvsuqcijkiovbfvcf","lzgwaiijmogbcrtpwmmbffzdt","fsqgolcvbncttmriivgagppbp","hsqbiaauxzqeogwrarpfuipmp","mxonxghsmrqazldhfhuakvdba","legajnsmaqdhfrsednjrlrhch","eebwbgifcrjdyunprrhgzamjz","suxzpxiruizscmubdapkvgoen","uvnekcbtcfreqywtrjiwymeqb","pquuuvmknvsafawymztykfphw","bhxfwbssquhcmpkwupzpuetih","pshdpvvkotfzcjrrzbarpljus","edgdulxyofngciphxznwqnghi","pwzrivzxmexawavglqkwgprxw","wimiohxvhtlhnzvmxdzokohbx","sjcqalwynbjaksrcjnvccwgry","qwfkyjeabdcrihatdbwhmzodh","thmqsvaywlqwdxuozpjddrvpw","jdpuawgqycxavrjqxflavpzyj","xphftvkfkvtdnskbvdaauujow","mwkcaowmafwecxdrpcwdkoxez","rrlbbvietzvkhbeonpsqpiogh","gyglgplsphtjuarwldnhnkrlc","sqshgljhutkbtjjjrvrtzxcdb","ihvnmwectywomjdibfnddnsfh","dymvirpvsqarzwiqnymiodjpn","evrocfhbeuleghbkdsobdbjdm","sbbfnsxujdnkeyqziptzkpemt","gmlucsfhiscphrwbvforsvnur","nfbceicqizfufcwfzjlmidhrf","tbqxanffjiubddidfrgbyeemr","fszmebvmvdsuiiprxkpbemcuf","ziwqcqzawkinvbcewnawezkhm","dmolmtryfobswfrujsckykhva","ewcflmhhprotrtnzcnbxyufad","qcebmfvorruiawoqyqrotlgnb","qdnwpemljzmudmyiqpqxpjcsf","xhaewbjgsdrmpencismzrqlyt","iyrrcbxvwgjwcdfagcqybywjm","rhezwydtrswwbzavkfdriqwbe","kljmfvnkyseotzcyrpwcfyoiy","xtygncsqeramomcgwupanqmng","uzoegsotzycktizwzswrvmles","fzlpchdikhotlgbllxsotxnci","rrwrxwqqzahgwhhjcvmlswdne","xtckpftazltocgvisvhihjmsu","aovdhambtnkvpguoyyeewwhql","qenewxnpzfhdbamfwkybxatbu","wqvursrgkyrrmgklgtaykmpgq","ezbwxkjxqbphoromxfepappwa","mzeqqrmcewepsrvkyvjgfhehb","ulzbezgwrroowtoraaifaaucf","rdxzzkdbnzyodndqvjhwmqyds","qtryvjjcrnoiirnlqdewcgvkp","slemeueamiapngfbuskzbfaxc","ssejwngvdgucntdadqdxhqgwd","lhgdmptbdbyptezaxgjshsnxn","qheoqszaxbvfnshrsjtqkcwhq","twwkkamuxcwpbylngylhcpgps","fszrvadibvxnynvkccjgftmxq","hftqnhwfgpdislmnkzmxwybbj","iimszlgolmfhhdabisrfcenzf","mztizykktjbpnsqgjagyhnldz","eacvxzcmnnigozbjzrazvauct","hkhkjjteoarrapbouggbahhiw","uknkzjtldsgyygjwyctxqaqwh","lduheaglipveqogteizobzxoc","ggvzcgkbngexqplfvmhpizlul","omjeoridfthannguvvhntdvom","uulivjajzfhhnhunyeqkmojrn","npofvbdqwtjfnewcjpozzmbwx","altzpuboytrkxphfnumxhxfan","scbdcfpqodxmqikioadndchsy","jfontgnoftejlunfuzvidcezt","pvohffrkmslopfhpigigfvzpi","kkhjbtzpfdgyljfgrftgnqbjz","sllgiexbwpsxfmgqttldvcnzg","exyfjlrkcioxywnauwfsumpbh","hkuzttgzjwssxxmftggubxeol","gftdpsshhaciduhwdmljinuae","uzktepjafqccyqbsqtoyvnnad","fnzrunpwibfrtkhsfvqkjowpz","gpvtlmokhpjxwvzxkvfhyfgrn","hgamrezqxpyovlkoqvezgcrlj","qslmbbunhudqnahuqqcgylroh","otchmbxeounavgfrkuzqkbqex","lcczifvmosisjerymaqvpieoq","ljvtceodrqrktbendtdstinos","jlkjnzrhaphrxeimartpxxphy","judhldzyjmfdqfsbfhonpqihc","lxrogqekurflpjkwqdfodttcu","firujuknynbfkrwblhdhvuhnn","cnnletsdehinmsyugthnuuyrm","stqcybdfqomliditbuvhvavqy","ckzjmubfhcgdmmwoijxjplxed","ttiemxdgkpaoxpdnzefudcxko","jiuqtnpnhgmyxnmcejjdzbafa","eumtsmovwqhgxsuzdvmkkdjih","irbvapivpnwigpeeykzpxphmt","czeqbkexwiyleknlgtnfwgwae","eklxclicwwcbfbeiuxpquficm","xatbwbssbbcnapobehzzlfcsm","ztnmuciopqkyqtxxbgkkczihr","heoqtjzetiuszbuokloowaqnv","vbdhkekufkwkqdqumhhzynawt","fjrqhknearpcukfaclsahmrsw","xlxxweposbstyfasishkbdbrf","qfrftyzjgtkzrrtwcacaqmxrd","ljcofosioagvqgyjxyhwabkdk","ecygwfqaaqqayzasmchpcciyg","lwnzokqggkdeavfdelbmsmopa","vzvzzohlabnugucaztiqpjnuz","hmpsvjlqrpdoujykjpjaszbyg","qecltqwdxhhtgwymcyzoegfjb","kkzpnmdohmpfwcaidqvvidhil","yorjkfvmajqogbazntfdcsxjw","ozmjrlijrcavpdquxgxsspdck","pbmnhemixfnnrxyehtvrgmcgj","hmjnhmsbeyqrclsrqnkcgvnbb","gnmjttbrssaqrxexvetvbbitl","mjeeunmjsnervdsryyohbaqwj","dbdqqvbuxumyyquawxqhtwmzw","pqlvjmbsdtcnigpzxsukzwmko","khfcvgkvzcacbvyjgxljcnsef","gttinaushwdwqszgvgnmyrrna","jawziwsmzxpemhvrehhmrpdrt","jraqsdwrhbuwtencsbrrdaocd","wcumhjpeoxtnyfmyjgidwdygz","zsupwrrbmfqxhznqvgzwncnuc","isxoessjaxelwczdrfgzvpzuf","mkvcyneoihyivzdjjyarvpptt","tblcltdkrtbnonydtvkwofhnz","bvdiheadshixavlsgzhljyvrh","wgyfxnvpdglythhclicnaspmk","jczrsbedwzgcolugcgagmpliu","hbtaozfiyuncpbxttubdjuawl","ysesrelasduqdvmqlivkemjwv","dvegpzylwacuitqstkwhexmfm","qpohxkseifqgjvzhtpvcudgbs","xnqfjgnptzygmrpkrtezkklwi","loagputwqufsnuiliwzkkswbm","qmaygqwpoluqgnluswyiqtkii","kfkgujfjnceqgnrfrhruhjbyt","hhuiezfqtimvwcuxzntfhlrne","fppfynqctklvcjofupfpppbgf","zhnjfvuqxiwlcgzdmvvvtgutp","wfojhsgkxnucxqjhotzsluesd","debcenekfzbmgwhhrapdtanmh","yjyndatsvodjcqstzrpwtohot","eahsjdyjpjmnkyjmrcarfpqfn","neawoysnozwgnpfntrgescdna","amyvbulegalkpvjwiwqiwupsr","orniwvnuhieayasqajpythnst","ckaaadehgciomnrgzwevjvncc","syvymkadfzwiolfaoovcixofd","dssksvddztfkrdasocdhthqic","vcivwcpuxpghqjprhzgteihsd","lcfuiasytbjayvaklpqmprckw","ycjvozfarxyakorbrhvchhowt","fpvstyicqmnyykqyqxrxhlxlj","puofavimwtasugazodnbbblky","nhqeihlxsygethktxbwlvnbja","xbstdokilljvqkkrjauydntpw"};
        System.out.println(findSubstring(s, words));
    }

    public List<Integer> findSubstring(String s, String[] words){
        List<Integer> list = new LinkedList<>();
        if(s == null || words == null || words.length == 0)return list;
        int sLen = s.length();
        int wordLen = words[0].length();
        int wordsLen = words.length;
        int subLen = wordLen * wordsLen;
        Map<String, Integer> wordCountMap = new HashMap<>();
        for(String w: words){
            wordCountMap.put(w, wordCountMap.containsKey(w)? wordCountMap.get(w) + 1 : 1);
        }
        for(int i = 0; i <= sLen - subLen; i++){
//            String subStr = s.substring(i, i + wordLen * wordsLen);
            Map<String, Integer> copyMap = new HashMap<>(wordCountMap);
            for(int j = i; j <= i + subLen - wordLen; j = j + wordLen){
                String subStr = s.substring(j, j+ wordLen);
                if(copyMap.containsKey(subStr)){
                    if(copyMap.get(subStr)  > 1){
                        copyMap.put(subStr,copyMap.get(subStr) - 1);

                    }
                    else {
                        copyMap.remove(subStr);
                    }
                }
                else break;

            }
            if(copyMap.isEmpty()){
                list.add(i);
            }
        }
        return list;
    }

//    public List<Integer> findSubstring(String s, String[] words) {
//        List<Integer> list = new LinkedList<>();
//        if(words.length == 0) return list;
//        int sLen = s.length();
//        int wsLen = words.length;
//        int wLen = words[0].length();
//        int subLen = wsLen * wLen;
//        Arrays.sort(words);
//        for(int i = 0; i < sLen - subLen + 1 ; i++ ){
//            String subStr = s.substring(i, i + subLen);
//            String[] subStrs = splitStr(subStr, wLen);
////            int j = i;
////            int index = 0;
////            while ((j + wLen - 1) < subLen){
////                subStrs[index] = subStr.substring(j, j + wLen);
////                index ++;
////                j = j + wLen;
////            }
//            if(compareStrs(subStrs, words)){
//                list.add(i);
//            }
//
//        }
//        return list;
//    }
//    public String[] splitStr(String str, int everyN){
//        int len = str.length();
//        String [] strs = new String[len/everyN];
//        int index = 0;
//        while (index < strs.length){
//            strs[index] = str.substring(index * everyN, (index + 1) * everyN);
//            index ++;
//        }
//        return  strs;
//    }
//
//    private boolean compareStrs(String[] subStrs, String[] words) {
//        Arrays.sort(subStrs);
//
//        boolean isSame = true;
//        for(int i = 0; i< subStrs.length; i++){
//            if(!subStrs[i].equals(words[i])){
//                isSame = false;
//                break;
//            }
//        }
//        return isSame;
//    }
}
