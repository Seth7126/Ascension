// 函数: _ZN14ascensionrules22TransformThisConstructEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x114238
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r1 = *(arg5 + 0xc)
core::CCardInstance* r5 = *(r1 + 0x10)
void* r7 = *(r5 + 0xc)
int32_t result = *(r7 + 0x150)

if (result != 0)
    result = ascension::CPlayer::RemoveConstructFromPlay(*(r1 + 0xc))
    
    if (result != 0)
        ascensionrules::TransformCard(arg2, arg3, r5, *(r7 + 0x150), true)
        return ascension::CWorld::PopResolveEffect(arg2) __tailcall

return result
