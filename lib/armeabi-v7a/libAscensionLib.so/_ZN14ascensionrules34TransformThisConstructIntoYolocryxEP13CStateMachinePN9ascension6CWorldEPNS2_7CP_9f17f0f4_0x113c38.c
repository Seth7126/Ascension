// 函数: _ZN14ascensionrules34TransformThisConstructIntoYolocryxEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x113c38
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r1 = *(arg5 + 0xc)
core::CCardInstance* r5 = *(r1 + 0x10)
int32_t result = ascension::CPlayer::RemoveConstructFromPlay(*(r1 + 0xc))

if (result == 0)
    return result

ascensionrules::TransformCard(arg2, arg3, r5, "Yolocryx, the Guardian", false)
return ascension::CWorld::PopResolveEffect(arg2) __tailcall
