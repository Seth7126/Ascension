// 函数: _ZN9ascension6CWorld23DrawCardFromSoulGemDeckEv
// 地址: 0xf4b20
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
char* entry_r0
core::CCardInstance* r0 = *(entry_r0 + 0xa5c)

if (r0 == 0 || zx.d(entry_r0[0xa14]) != 0)
    return 0

if (*(r0 + 0x18) == 0)
    int32_t r2_1 = *(entry_r0 + 0xa50)
    int32_t r1_3 = *(entry_r0 + 0xa54)
    
    if (r1_3 != r2_1)
        while (r2_1 != r1_3)
            *(r1_3 - 4)
            core::CCardStack::PutCardOnTop(r0)
            r2_1 = *(entry_r0 + 0xa50)
            r0 = *(entry_r0 + 0xa5c)
            r1_3 = *(entry_r0 + 0xa54) - 4
            *(entry_r0 + 0xa54) = r1_3
        
        core::CCardStack::Shuffle()
        core::CWorldBase::OutputMessage(entry_r0)
        *(entry_r0 + 0xa5c)
        return core::CCardStack::RemoveTopCard() __tailcall

return core::CCardStack::RemoveTopCard() __tailcall
