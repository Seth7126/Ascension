// 函数: _ZN14ascensionrules26AcquireHeroOrDefeatMonsterEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10b0b8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *(arg2 + 0x30)
bool r1 = false

if (r0 u> 0x13)
    r1 = true

bool r0_1 = false

if (r0 u< 0xf)
    r0_1 = true

ascensionrules::CreateStateProcessAcquireOrDefeatAnyCenterRow(arg3, arg4, false, true, r0_1, true, 
    r1, false)
return CStateMachine::PushListState(arg1) __tailcall
