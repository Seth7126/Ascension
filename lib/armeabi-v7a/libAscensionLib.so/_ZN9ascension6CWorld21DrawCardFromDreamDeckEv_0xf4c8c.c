// 函数: _ZN9ascension6CWorld21DrawCardFromDreamDeckEv
// 地址: 0xf4c8c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* entry_r0
void* r0 = *(entry_r0 + 0xa60)

if (r0 == 0 || zx.d(*(entry_r0 + 0xa14)) != 0)
    return 0

if (*(r0 + 0x18) != 0)
    return core::CCardStack::RemoveTopCard() __tailcall

ascension::CWorld::ShuffleVoidDreamCardsIntoDreamDeck()
*(entry_r0 + 0xa60)
return core::CCardStack::RemoveTopCard() __tailcall
