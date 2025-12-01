// 函数: _ZN14ascensionrules39CStateProcessAcquireAllCenterRowPortals22SelectAcquireToDiscardER13CStateMachineP6CStateiPj
// 地址: 0x161df4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r4 = *(arg2 + 0x24c)
void* result = ascension::CWorld::GetCenterRowCard(*(r4 + 4))

if (result != 0)
    void** r0_1 = operator new(0x2b0)
    CGameStateOptions::CGameStateOptions(r0_1.b)
    r0_1[0x99].w = 0
    *r0_1 = _vtable_for_ascensionrules::CStateProcessAcquirePortal + 8
    *(r0_1 + 0x266) = 0
    r0_1[0x93] = r4
    r0_1[0x94] = result
    r0_1[0x95] = 7
    r0_1[0x96] = arg3
    r0_1[0x97] = 3
    r0_1[0x98] = 0
    CState::AddOwnedChild(arg2)
    CStateList::AppendState(arg2)
    result = arg2 + arg3
    *(result + 0x270) = 1

return result
