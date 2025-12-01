// 函数: _ZN9ascension6CWorld34ShuffleVoidDreamCardsIntoDreamDeckEv
// 地址: 0xf4ce0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CCard* entry_r0
int32_t r0_1 = *(*(entry_r0 + 0xa60) + 0x18)

if (r0_1 != 0)
    return r0_1

void* r0_2 = *(entry_r0 + 0xa64)

if (*(r0_2 + 0x18) s< 1)
    return r0_2

void* i_2 = core::CCardStack::RemoveTopCard()

if (i_2 != 0)
    void* i_1 = i_2
    void* i
    
    do
        if (*(entry_r0 + 0x30) u>= 0x17)
            *(i_1 + 0xc)
            ascension::CWorld::CreateCard(entry_r0)
        
        core::CCardStack::AddCard(*(entry_r0 + 0xa60))
        *(entry_r0 + 0xa64)
        i = core::CCardStack::RemoveTopCard()
        i_1 = i
    while (i != 0)

*(entry_r0 + 0xa60)
core::CCardStack::Shuffle()
return core::CWorldBase::OutputMessage(entry_r0) __tailcall
