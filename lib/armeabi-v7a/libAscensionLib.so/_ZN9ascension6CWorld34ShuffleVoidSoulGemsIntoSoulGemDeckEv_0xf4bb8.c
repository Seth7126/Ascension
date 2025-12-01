// 函数: _ZN9ascension6CWorld34ShuffleVoidSoulGemsIntoSoulGemDeckEv
// 地址: 0xf4bb8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
char* entry_r0
core::CCardInstance* result = *(entry_r0 + 0xa5c)

if (result != 0)
    if (*(result + 0x18) != 0)
        return result
    
    int32_t r2_1 = *(entry_r0 + 0xa50)
    int32_t r1_2 = *(entry_r0 + 0xa54)
    
    if (r1_2 != r2_1)
        while (r2_1 != r1_2)
            *(r1_2 - 4)
            core::CCardStack::PutCardOnTop(result)
            r2_1 = *(entry_r0 + 0xa50)
            result = *(entry_r0 + 0xa5c)
            r1_2 = *(entry_r0 + 0xa54) - 4
            *(entry_r0 + 0xa54) = r1_2
        
        core::CCardStack::Shuffle()
        return core::CWorldBase::OutputMessage(entry_r0) __tailcall

return result
