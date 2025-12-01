// 函数: _ZNK14ascensionrules26CStateProcessPlayProxyTurn10CloneStateER13CStateMachinePN4core10CWorldBaseERPc
// 地址: 0x176594
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x30) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void** entry_r3
void** result = *entry_r3

if (result == 0)
    result = operator new(0x38)
    CState::CState()
    result[0xc] = r0_2
    *result = _vtable_for_ascensionrules::CStateProcessPlayProxyTurn + 8
    result[0xd].w = 0x101
else
    CState::CState()
    result[0xc] = r0_2
    *result = _vtable_for_ascensionrules::CStateProcessPlayProxyTurn + 8
    result[0xd].w = 0x101
    result[0xb].b = 0
    *entry_r3 += 0x38

result[0xa] = arg1
result[0xd].b = *(arg1 + 0x34)
*(result + 0x35) = *(arg1 + 0x35)
return result
