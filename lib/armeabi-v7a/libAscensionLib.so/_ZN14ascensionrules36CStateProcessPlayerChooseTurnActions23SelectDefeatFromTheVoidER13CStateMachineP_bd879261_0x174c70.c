// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions23SelectDefeatFromTheVoidER13CStateMachineP6CStateiPj
// 地址: 0x174c70
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r8 = *(arg2 + 0x24c)
char* r7 = *(r8 + 4)
int32_t* result = core::CWorldBase::GetInstanceByID(r7)

if (result != 0)
    int32_t r1_1 = *(arg2 + 0xefc)
    
    if (r1_1 s>= 1)
        int32_t* result_1 = result
        result = *(arg2 + 0xf00)
        int32_t r5_1 = 0
        int32_t r2 = 0
        
        do
            if (*(result + r5_1) == result_1)
                if (zx.d(r7[0xb34]) == 0)
                    ascension::CWorld::RemoveDefeatNonTrophyMonsterFromVoid(r7)
                    result = *(arg2 + 0xf00)
                
                void* r1_4 = result_1[3]
                int32_t r10 = *(r7 + 0xb48)
                int32_t r9 = *(result + r5_1 + 0xc)
                uint32_t var_3c
                int32_t var_38
                int32_t var_34
                
                if (zx.d(*(r1_4 + 0xd7)) != 0 && *(r8 + 0x8c) s>= 1)
                    uint32_t r5_3
                    
                    if (zx.d(r7[0xb29]) == 0)
                        r5_3 = 0
                        
                        if (zx.d(r7[0xb2a]) != 0 && ascension::CCard::IsCardFaction(r1_4) != 0)
                            r5_3 = 4
                    else
                        r5_3 = 4
                    
                    var_3c = r5_3
                    var_38 = 0
                    var_34 = 4
                    ascensionrules::CreateStateMustPayResources(r8, result_1, 0, r9, 0, var_3c, 0, 
                        4)
                    CState::AddOwnedChild(arg2)
                    CStateList::AppendState(arg2)
                else if (*(r7 + 0x30) u< 0x16)
                label_174e30:
                    
                    if (r9 s<= r10)
                        ascension::CWorld::RemoveCurrentTurnPower(r7)
                    else
                        ascension::CWorld::RemoveCurrentTurnPower(r7)
                        ascension::CWorld::RemoveCurrentTurnRunes(r7)
                else
                    if (zx.d(r7[0xb29]) == 0)
                        if (zx.d(r7[0xb2a]) == 0)
                            goto label_174e30
                        
                        if (ascension::CCard::IsCardFaction(r1_4) != 0)
                            goto label_174d5c
                        
                        goto label_174e30
                    
                label_174d5c:
                    var_3c = 4
                    var_38 = 0
                    var_34 = 0
                    ascensionrules::CreateStateMustPayResources(r8, result_1, 0, r9, 0, 4, 0, 0)
                    CState::AddOwnedChild(arg2)
                    CStateList::AppendState(arg2)
                
                core::CWorldBase::OutputMessageFormat(r7, 
                    "%s defeats %s from The Void (%d power)\n", r8 + 0x10, r1_4 + 4, r9, var_3c, 
                    var_38, var_34)
                ascensionrules::CreateStateProcessDefeatMonsterSequence(r8, result_1, 9, 
                    0xfffffffe, 8, false, true, false, nullptr, 0)
                CState::AddOwnedChild(arg2)
                return CStateList::AppendState(arg2) __tailcall
            
            r2 += 1
            r5_1 += 0x34
        while (r2 s< r1_1)

return result
