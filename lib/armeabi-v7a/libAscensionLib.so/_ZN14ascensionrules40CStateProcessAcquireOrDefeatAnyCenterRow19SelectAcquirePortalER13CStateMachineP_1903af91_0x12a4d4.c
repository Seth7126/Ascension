// 函数: _ZN14ascensionrules40CStateProcessAcquireOrDefeatAnyCenterRow19SelectAcquirePortalER13CStateMachineP6CStateiPj
// 地址: 0x12a4d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r6 = *(arg2 + 0x24c)
core::CCardInstance* result = ascension::CWorld::GetCenterRowCard(*(r6 + 4))

if (result != 0)
    ascensionrules::CreateStateProcessAcquirePortal(r6, result, 7, arg3, 3)
    CState::AddOwnedChild(arg2)
    CStateList::AppendState(arg2)
    result = 1
    *(arg2 + 0xcec) = 1

return result
