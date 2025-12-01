// 函数: _ZN14ascensionrules25TriggerReplaceSeventhCardEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11ade0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r9 = *(arg3 + 0xc)
core::CCardInstance* r6 = *(r9 + 4)

if (*(r6 + 0xb10) != 6)
    return 

ascension::CWorld::SetCenterRowSize(r6)
uint32_t i_2 = ascension::CWorld::RemoveCenterRowCard(r6, true)

if (i_2 != 0)
    uint32_t i_1 = i_2
    uint32_t i
    
    do
        int32_t var_40_1 = 0
        ascension::CWorld::OutputAnimationCard(r6, i_1, 6, 7, 6, 9, 0, 
            &(*__elf_header.ident.signature)[1])
        ascension::CWorld::PutCardInVoid(r6)
        i = ascension::CWorld::RemoveCenterRowCard(r6, true)
        i_1 = i
    while (i != 0)

ascensionrules::CreateStateRemoveCenterRowCard(r9, 6, nullptr, true, false, 0, 0, false, nullptr, 
    nullptr, 0, nullptr, 0)
return CStateMachine::PushListState(arg1) __tailcall
