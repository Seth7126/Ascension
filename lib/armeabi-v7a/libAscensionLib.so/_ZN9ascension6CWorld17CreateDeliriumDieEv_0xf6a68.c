// 函数: _ZN9ascension6CWorld17CreateDeliriumDieEv
// 地址: 0xf6a68
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
uint32_t entry_r0
int32_t result = *(entry_r0 + 0xa88)

if (result != 0)
    return result

core::CWorldBase* r0 = operator new(0xc)
*(entry_r0 + 4) += 1
ascension::CDeliriumDieInstance::CDeliriumDieInstance(r0, entry_r0)
*(entry_r0 + 0xa88) = r0
return core::CWorldBase::AddInstance(entry_r0) __tailcall
